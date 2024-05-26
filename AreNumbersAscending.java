class AreNumbersAscending {
    public boolean areNumbersAscending(String s) {
        String[] temp = s.split(" ");
        int a = -1;
        for(int i=0; i<temp.length; i++){
            try{
                int b = Integer.parseInt(temp[i]);
                if(b > a){
                    a = b;
                    continue;
                }else{
                    return false;
                }
            }catch(Exception e){
                continue;
            }  
        }
        return true;
    }
}
