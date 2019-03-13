package Java2;

public class CustomException extends Exception {
    @Override
    public Throwable fillInStackTrace(){
        return this;
    }
}

class Main2 {
    public static void main(String[] args) {
        try {
            throw new CustomException();
        }
        catch(Exception e){
            e.printStackTrace();

        }
    }
}



