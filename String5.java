/*

Remove the duplicate words.


*/

 

class String5{
	public static void main(String abc[]){
		remove("Hello shafeeq saeed shafeeq hello hello Hello saeed");

	}


	public static String find(String msg,String lookfor){
		int i=0;
		int count=1;
		String newmessage="";
		//System.out.println(msg+".."+lookfor);
		for(;i<msg.length();i++){
			//System.out.println(i+msg.substring(i,i+1));
				if (msg.substring(i,i+1).equals(lookfor.substring(0,1))){
					if(msg.length()-i>=lookfor.length()){
					//	System.out.println("->"+i+".."+(i+lookfor.length())+".."+msg.substring(i,i+lookfor.length()));
						if(msg.substring(i,i+lookfor.length()).equals(lookfor)){
							//System.out.println(count);
							
							if(count==1){
								newmessage+=msg.substring(i,i+lookfor.length());
							}
							count++;
							i+=lookfor.length()-1;

						}else{
							newmessage+=msg.substring(i,i+1);
						}
					}else{
						newmessage+=msg.substring(i,i+1);
					}
				}else{
					newmessage+=msg.substring(i,i+1);
				}
			
		}
		//System.out.println("..."+newmessage);
		return newmessage;
	}
	public static void remove(String msg){
		String word="";
		int i=0;
		System.out.println("Old Message:"+msg);
		for(;i<=msg.length() ;i++){			
			if(i==msg.length() || msg.substring(i,i+1).equals(" ") ){
				if(word.length()>0){ // if there is  space at the end
					msg=find(msg,word);
					//System.out.println(word+".."+word.length());
					word="";
				}
			}else{
				word+=msg.substring(i,i+1);
			}
		}
		System.out.println("New Message:"+msg);
		

	}
}
