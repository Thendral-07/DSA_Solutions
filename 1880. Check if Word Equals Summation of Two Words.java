class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int firstW = convertNumber(firstWord); // converting the string into a numeric array like a=0,b=1,c=2 like that etc upto z=25
        int secondW = convertNumber(secondWord);
        int targetW = convertNumber(targetWord);
        if(firstW + secondW == targetW){

            return true;
        }
        return false;
    }
    private int convertNumber(String s){
        String res = "";
        for(char c:s.toCharArray()){ //breaks each char to an induvitual array like abc = 'a','b','c'
            res+=(c-'a');//converting into numberic string by subtracting the each char by ASCII value of a a=97 like that goes until the loop ends
        }
        return Integer.parseInt(res);//converting string into number eg = "121" as 121
    }
}
