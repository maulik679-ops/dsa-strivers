class Solution{
    public void studenGrade(int marks){
        if(marks>=90){
            System.out.println("A");
        }
        else if(marks>=70){
            System.out.println("B");
        }
        else if(marks>=50){
            System.out.println("C");
        }
        else if(marks>=35){
            System.out.println("D");
        }
        else{
            System.out.println("Fail");
        }
    } 
}

public class If_ElseIf {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.studenGrade(90);
        s.studenGrade(70);
    }
}
