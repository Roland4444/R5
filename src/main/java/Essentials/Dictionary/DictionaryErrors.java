package Essentials.Dictionary;

import java.util.HashMap;
import java.util.Map;

public class DictionaryErrors {
    public Map<Integer, String> dict = new HashMap();
    public DictionaryErrors(){
        this.dict.put(1,"ошибка в адресе банка получателя");
        this.dict.put(2,"ошибка в номере счета получателя");
        this.dict.put(3,"ошибка в бике банка поучателя");
        this.dict.put(4,"ошибка в корр счете банка получателя");
        this.dict.put(5,"ошибка в имени банка получателя");
        this.dict.put(6,"ошибка в адресе банка отправителя");
        this.dict.put(7,"ошибка в номере счета отправителя");
        this.dict.put(8,"ошибка в бике банка отправителя");
        this.dict.put(9,"ошибка в корр счете банка отправителя");
        this.dict.put(10,"ошибка в имени банка отправителя");
        this.dict.put(50,"ошибка в инн получателя");
        this.dict.put(51,"ошибка в кпп получателя");
        this.dict.put(52,"ошибка в инн отправителя");
        this.dict.put(53,"ошибка в кпп отправителя");




    }

}
