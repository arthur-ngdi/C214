public class MockInimigoService implements InimigoService {


    @Override
    public String busca(int id) {

        if (id == 10){
            return InimigoConst.SKELETON;
        }else if (id == 20){
            return InimigoConst.DRAGAO;
        }else if(id < 0){
            return InimigoConst.INEXISTENTE;
        }else{
            return InimigoConst.PADRAO;
        }
    }


}
