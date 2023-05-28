public class Sistema{
    public double resto;
    public double n2;
    public double n5;
    public double n10;
    public double n20; 
    public double n50;
    public double nT2=20;
    public double nT5=20;
    public double nT10=20;
    public double nT20=20;
    public double nT50=20;
    public double aux;
    
    public void nota(){
        if(aux>=50 && nT50>0){ 
            if((int)aux/50>nT50){
                n50=nT50;
                resto=aux-(n50*50);
                aux=resto;
            }
            else{
                n50=(int)aux/50;
                resto=aux%50;
                aux=resto;
            }
            nT50-=n50;
        }
        if(aux>=20 && nT20>0){
            if((int)aux/20>nT20){
                n20=nT20;
                resto=aux-(n20*20);
                aux=resto;
            }
            else{
                n20=(int)aux/20;
                resto=aux%20;
                aux=resto;
            }
            nT20-=n20;
        }
        if(aux>=10 && nT10>0){
            if((int)aux/10>nT10){
                n10=nT10;
                resto=aux-(n10*10);
                aux=resto;
            }
            else{
                n10=(int)aux/10;
                resto=aux%10;
                aux=resto;
            }
            nT10-=n10;
        }
        if(aux>=5 && nT5>0){
            if((int)aux/5>nT5){
                n5=nT5;
                resto=aux-(n5*5);
                aux=resto;
            }
            else{
                n5=(int)aux/5;
                resto=aux%5;
                aux=resto;
            }
            nT5-=n5;
            
        }
        if(aux>=2 && nT2>0){
            if((int)aux/2>nT2){
                n2=nT2;
                resto=aux-n2*2;
                aux=resto;
            }
            else{
                n2=(int)aux/2;
                resto=aux%2;
                aux=resto;
            }
            nT2-=n2;
        }
        
    }
    
    
    
    public void reporNota(){
    nT2=20;
    nT5=20;
    nT10=20;
    nT20=20;
    nT50=20;
    }
}