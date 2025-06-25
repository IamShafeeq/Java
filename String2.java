//find the longest word in the provided string
class String2{

	public static void main(String abc[]){
		LogestWord("Hello shafeeq, are you going to manchester");

	}

	public static void LogestWord(String msg){
		String word="",longest="";
		int i=0;
		for(;i<=msg.length() ;i++){			
			if(i==msg.length() || msg.substring(i,i+1).equals(" ") ){
				if(word.length()>longest.length()){
					longest=word;
				}
				word="";
			}else{
				word+=msg.substring(i,i+1);
			}
		}
		System.out.println("Longest Word is:"+longest);

	}
}