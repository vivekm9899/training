class Vote {
    public boolean voting(int age){
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
        }

    public static void main(String args[]) {
        Vote obj = new Vote();
        boolean status = obj.voting(21); 
        if (status == true) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote"); 
        }
        }
        }
