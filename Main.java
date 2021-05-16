import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        task5Lexer lexer;
        task5Parser parser;
        String[] inputsArray = {"0100001","00000011111","1110101011", "010011", "11111011001","011110100","1010000","100110100","11000001","0000101"};
        for(int i = 0; i< inputsArray.length; i++){
            lexer = new task5Lexer(CharStreams.fromString(inputsArray[i]));
            parser = new task5Parser(new CommonTokenStream(lexer));
            parser.start();
            System.out.println();
        }



    }
}

