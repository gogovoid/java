import java.io.IOException;
import java.io.InputStreamReader;

public class rd_parser {
	static char LA = 0;
	static InputStreamReader isr;

	static char nexttoken() throws IOException {
		return (char) isr.read();
	}
	static void match(char token) throws IOException{
		if(LA == token){
			LA = nexttoken();
		}else{
			error(token);
		}
	}
	static void error(char c){
		System.out.println("Syntax Error : '" + c + "'\n");
		System.exit(-1);
	}
	static void K() throws IOException {
		if((int)LA == -1)
			return;
		else{
			S(); match('\n'); K();
		}
	}
	static void S() throws IOException {
		if(LA == '('){
			match('('); S(); match(')'); S();
		} else {
			;
		}
	}
	public static void main(String[] args) throws IOException{
		isr = new InputStreamReader(System.in);
		LA = nexttoken();
		K();
	}
}
