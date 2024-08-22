/* 
383. Ransom Note
Status: Accepted
Runtime: 8 ms
Memory Usage: 44.4 MB
*/

public class Main {
    /*
    METHOD: moving from left we check if that letter of ransomnote is present in magazine

Each letter in magazine can only be used once in ransomNote. So If ransome>magazine return false
If it isnt for any letter, return false 
If it is then we remove that letter from magazine and shorten it.

stringbuffewr class has delete method in it


when trying to create a stringbuffer object of the same name
    variable magazine is already defined in method main(String[])
method .delete(int,int) exists in stringbuffer class

The left-hand side of an assignment must be a variableJava(1610612959)
 */

    public static void main(String[] args) {
        String ransome = "aab";
        String magazine ="bab";

        returnboo obj = new returnboo();
        boolean b1=obj.value(ransome,magazine); 
        
        System.out.print(b1);

    }
}

class returnboo{
    public boolean value(String r, String m){
        
        StringBuffer a = new StringBuffer(r);
        StringBuffer b = new StringBuffer(m);
        if(a.length()>b.length())
            return false;
        else {
            char character;
            int i=0;
            int j=0;

                for(i=0;i<a.length();i++){
                    character = a.charAt(i);
                    for(j=0;j<b.length();j++){
                        if (character==b.charAt(j)){
                           if(b.length()-1!=j ){
                            b.delete(j,j+1);
                            break;
                           }
                        else 
                        break;
                        }
                    }
                    if (b.length()==j)
                        return false;
                }
                return true;
        }
    }
}


