public class studentcourseinfo extends student {
    private String[] courseCodes = { "C#", "ST", "ML", "DEVOPS", "MP" };
    private int[] marks_IA1 = { 85, 92, 75, 88, 95 };
    private int[] marks_IA2 = { 85, 92, 75, 88, 95 };


    public void displayStudentMarks() {
        System.out.println("Course Codes \t Marks Obtained in IA_1 \tIA_2 ");

        for (int i = 0; i < courseCodes.length; i++) {
            System.out.println(courseCodes[i] + "\t\t\t" + marks_IA1[i]+ "\t\t\t" + marks_IA2[i]);
        }
       
    }
    /**
     * @return
     */
    public void totalStudentMarks(){
        int total=0;
        int total_2=0;
        for(int i = 0; i < marks_IA1.length; i++){
            
             total += marks_IA1[i];
        }
        System.out.println("Total marks in IA_1: "+total);
    
    for(int i = 0; i < marks_IA2.length; i++){
        
        total_2 += marks_IA2[i];
   }
   System.out.println("Total marks in IA_2: "+total_2);

    int totalmarks= total+total_2;
    System.out.println("Total marks"+totalmarks);
}}