package SelectionProblem;

public class JudgeWhereObject {
    public JudgeDto judge(DivideDto dto, int find){
        int smallSize = dto.getSmall().size();

        if(find<=smallSize){
            return new JudgeDto("Small",smallSize-find);
        } else if (find==smallSize+1) {
            return new JudgeDto("FIND",0);
        }else {
            return new JudgeDto("Big",dto.getBig().size()-find);
        }
    }
}
