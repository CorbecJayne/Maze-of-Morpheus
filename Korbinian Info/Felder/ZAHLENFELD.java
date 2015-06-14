class ZAHLENFELD{
    //Attribute;
    
    //Rfernzattribute;
    private double[]komode;
    
    //Konstruktor;
    public ZAHLENFELD(){
        komode = new double [8];
        komode [0] = 1.1;
        komode [2] = 1.73;
        komode [4] = 2;
        
    }
    
    public void Afüllen(){
        for(int a = 5; a < 8; a++){
            komode [a] = 2* komode [a-1];
        }
        /*komode [5] = 2* komode [4];
        komode [6] = 2* komode [5];
        komode [7] = 2* komode [6];*/
    }
    
    public void Bfüllen(){
        komode[0] = 1;
      for (int i=0 ; i<7 ; i++){
        if (komode [i] == 0){
            komode [i] = 2* komode [i-1];
        }
      }
    }
    
}
