public class Fibinacci {
    public int Fibinacci(int f){
        if(f<3){
            return 1;
        }
        else{
            return Fibinacci(f-1) + Fibinacci(f-2);
        }
    }
}
