package vn.edu.iuh.fit.ktpm_20042961_dangthiquyentran.services;

import lombok.NoArgsConstructor;

import java.util.Base64;
@NoArgsConstructor
public class EncryptionText {
    public String enCrypt(String text){
        return new String(Base64.getEncoder().encode(text.getBytes()));
    }
    public String deCrypt(String textEncryt){
        return new String(Base64.getDecoder().decode(textEncryt.getBytes()));
    }
}
