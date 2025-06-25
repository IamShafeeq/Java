/*
 Write a function that takes a list of strings an prints them, 
 one per line, in a rectangular frame. 
 For example the list ["Hello", "World", "in", "a", "frame"]
  gets printed as:

*********
* Hello *
* World *
* in    *
* a     *
* frame *
*********
*/

incomplete 


class String3{

	public static void main(String abc[]){
		printing("Hello shafeeq, are you ");

	}

	public static void printing(String msg){
		String word="";
		int i=0;
		for(;i<=msg.length() ;i++){			
			if(i==msg.length() || msg.substring(i,i+1).equals(" ") ){
				System.out.println("* "+word);
				word="";
			}else{
				word+=msg.substring(i,i+1);
			}
		}
		

	}
}