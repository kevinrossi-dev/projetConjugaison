package main;

public class PasseCompose extends Temp{
    public PasseCompose(String temp){
        if(!(temp.trim().equalsIgnoreCase("passé composé")))
            throw new IllegalArgumentException();
    }

    @Override
    public String conjugue(Verbe v) {
        StringBuilder sb = new StringBuilder();
        sb.append(v.conjugue1erePersonneSingulierPasseCompose()+'\n');
        sb.append(v.conjugue2emePersonneSingulierPasseCompose()+'\n');
        sb.append(v.conjugue3emePersonneSingulierPasseCompose()+'\n');
        sb.append(v.conjugue1erePersonnePlurielPasseCompose()+'\n');
        sb.append(v.conjugue2emePersonnePlurielPasseCompose()+'\n');
        sb.append(v.conjugue3emePersonnePlurielPasseCompose()+'\n');


        return sb.toString();
    }
}
