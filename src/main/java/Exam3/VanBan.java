package Exam3;

public class VanBan {
    private String st;

    public VanBan(){

    }
    public VanBan(String st){
        this.st = st;
    }
    public int stringCount() {
        String newSt = this.st.trim().replaceAll("\\s+", " ");
        if (newSt.length() == 0){
            return 0;
        }else {
            return newSt.split(" ").length;
        }
    }
    public String formatString(){
        String newSt = this.st.trim().replaceAll("\\s+", " ");
        return newSt;
    }

    public String toUpperCase(){
        String newSt = this.st.trim().replaceAll("\\s+", " ");
        return newSt.toUpperCase();
    }

    public String toLowerCase(){
        String newSt = this.st.trim().replaceAll("\\s+", " ");
        return newSt.toLowerCase();
    }

    public String toCapitalize(){
        String newSt = this.st.trim().replaceAll("\\s+", " ");
        String[] arr = newSt.split(" ");
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase() + " ";
        }
        return result;
    }
}
