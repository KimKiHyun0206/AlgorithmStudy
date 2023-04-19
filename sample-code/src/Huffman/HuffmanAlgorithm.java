package Huffman;

import java.util.*;

public class HuffmanAlgorithm {
    // Java에서 허프만 코딩 알고리즘 구현
    public static void main(String[] args) {
        String text = new Scanner(System.in).nextLine();
        buildHuffmanTree(text);
    }

    // Huffman 트리를 탐색하고 지도에 Huffman 코드를 저장합니다.
    public static void encode(Node root, String str,
                              Map<Character, String> huffmanCode) {
        if (root == null) {
            return;
        }

        // 리프 노드를 찾았습니다.
        if (isLeaf(root)) {
            huffmanCode.put(root.ch, str.length() > 0 ? str : "1");
        }

        encode(root.left, str + '0', huffmanCode);
        encode(root.right, str + '1', huffmanCode);
    }

    // Huffman 트리를 탐색하고 인코딩된 문자열을 디코딩합니다.
    public static int decode(Node root, int index, StringBuilder sb) {
        if (root == null) {
            return index;
        }

        // 리프 노드를 찾았습니다.
        if (isLeaf(root)) {
            System.out.print(root.ch);
            return index;
        }

        index++;

        root = (sb.charAt(index) == '0') ? root.left : root.right;
        index = decode(root, index, sb);
        return index;
    }

    // Huffman Tree에 단일 노드만 포함되어 있는지 확인하는 유틸리티 함수
    public static boolean isLeaf(Node root) {
        return root.left == null && root.right == null;
    }

    // Huffman Tree를 구축하고 주어진 입력 텍스트를 디코딩합니다.
    public static void buildHuffmanTree(String text) {
        // 기본 케이스: 빈 문자열
        if (text == null || text.length() == 0) {
            return;
        }

        // 각 문자의 출현 빈도 계산
        // 맵에 저장

        Map<Character, Integer> freq = new HashMap<>();
        for (char c : text.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Huffman 트리의 라이브 노드를 저장할 우선 순위 대기열를 만듭니다.
        // 가장 높은 우선 순위 항목이 가장 낮은 빈도를 가짐에 유의하십시오.

        PriorityQueue<Node> pq;
        pq = new PriorityQueue<>(Comparator.comparingInt(l -> l.freq));

        // 각 문자에 대한 리프 노드를 만들고 추가합니다.
        // 우선 순위 대기열에.

        for (var entry : freq.entrySet()) {
            pq.add(new Node(entry.getKey(), entry.getValue()));
        }

        // Queue에 하나 이상의 노드가 있을 때까지 수행
        while (pq.size() != 1) {
            // 우선 순위가 가장 높은 두 노드를 제거합니다.
            // Queue에서 (가장 낮은 빈도)

            Node left = pq.poll();
            Node right = pq.poll();

            // 이 두 노드를 자식으로 사용하여 새 내부 노드를 만듭니다.
            // 그리고 두 노드의 합과 같은 빈도로 '
            // 주파수. 우선 순위 대기열에 새 노드를 추가합니다.

            int sum = left.freq + right.freq;
            pq.add(new Node(null, sum, left, right));
        }

        // `root`는 Huffman Tree의 루트에 대한 포인터를 저장합니다.
        Node root = pq.peek();

        // Huffman 트리를 탐색하고 Huffman 코드를 맵에 저장합니다.
        Map<Character, String> huffmanCode = new HashMap<>();
        encode(root, "", huffmanCode);

        // 허프만 코드 출력
        System.out.println("Huffman Codes are: " + huffmanCode);
        System.out.println("The original string is: " + text);

        // 인코딩된 문자열 인쇄
        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray()) {
            sb.append(huffmanCode.get(c));
        }

        System.out.println("The encoded string is: " + sb);
        System.out.print("The decoded string is: ");

        if (isLeaf(root)) {
            // 특수한 경우: aa, aaa 등과 같은 입력의 경우
            while (root.freq-- > 0) {
                System.out.print(root.ch);
            }
        } else {
            // Huffman Tree를 다시 탐색하고 이번에는
            // 인코딩된 문자열을 디코딩
            int index = -1;
            while (index < sb.length() - 1) {
                index = decode(root, index, sb);
            }
        }
    }
}
