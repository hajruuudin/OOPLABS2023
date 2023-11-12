package HashMaps;

import java.util.HashMap;

class Exercise2 {
    public static void main(String[] args){
        PromissoryNote mattisNote = new PromissoryNote();

        mattisNote.setLoan("Arto", 51.5);
        mattisNote.setLoan("Arto", 10.5);


        System.out.println(mattisNote.howMuchIsTheDebt("Arto"));

    }

    static class PromissoryNote{
        private HashMap<String, Double> loanMap;

        public PromissoryNote(){
            this.loanMap = new HashMap<String, Double>();
        }

        public void setLoan(String toWhom, double value){
            this.loanMap.put(toWhom, value);
        }

        public double howMuchIsTheDebt(String person){
            if(this.loanMap.get(person) == null){
                return 0.0;
            } else {
                return this.loanMap.get(person);
            }
        }

    }
}
