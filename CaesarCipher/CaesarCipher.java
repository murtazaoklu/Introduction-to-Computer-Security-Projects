/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaesarCipher;

/**
 *
 * @author Murtaza Oklu
 */
import java.util.Scanner;
public class CaesarCipher {

        public static String decrypt(String plainText, int shift){
            if (shift > 26){
                shift = shift%26;
            }
            else if (shift < 0){
                shift = (shift%26)+26;
            }
            String chipherText = "";
            int length = plainText.length();
            for (int i=0; i<length; i++){
                char ch = plainText.charAt(i);
                if(Character.isLetter(ch)){
                    if(Character.isLowerCase(ch)){
                        char c = (char)(ch - shift);
                        if(c < 'a'){
                            chipherText += (char)(ch + (26 - shift));
                            
                        }
                        else{
                            chipherText += c;
                        }
                    }
                    else if(Character.isUpperCase(ch)){
                        char c = (char)(ch - shift);
                        if (c < 'A'){
                            chipherText += (char)(ch + (26 - shift));
                        }
                        else{
                            chipherText += c;
                        }
                    }
                }
                else {
                    chipherText += ch;
                }
            }
            return chipherText;
        }
        
        public static void main(String[] args){
            String text = " Ty ncjaezrclasj, pyncjaetzy td"
                    + " esp acznpdd zq eclydqzcxtyr tyqzcxletzy "
                    + "(cpqpccpo ez ld awltyepie) fdtyr ly lwrzctesx "
                    + "(nlwwpo ntaspc) ez xlvp te fycplolmwp ez lyjzyp"
                    + " pinpae eszdp azddpddtyr dapntlw vyzhwporp, fdflwwj "
                    + "cpqpccpo ez ld l vpj. Esp cpdfwe zq esp acznpdd td "
                    + "pyncjaepo tyqzcxletzy (ty ncjaezrclasj,"
                    + " cpqpccpo ez ld ntaspcepie).";
            String decrypted = decrypt(text, 11);
            System.out.println(decrypted);
        }
       
}