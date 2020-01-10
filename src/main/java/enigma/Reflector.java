// classe permettant de chiffer
package enigma;

/** Class that represents a reflector in the enigma.
 *  @author
 */
// fonction refector qui definie ce que fait le reflector
public class Reflector extends Rotor {
	
	int[] reflection;
	
	public static Reflector reflectorFactory(String str){
		char[] s = str.trim().replace(" ", "").toCharArray();
		int[] cipher = new int[26];
		for (int i = 0; i< 26; i++){
			cipher[i] = toIndex(s[i]);
		}
		return new Reflector(cipher);
	}
	
	private Reflector(int[] r){
		reflection = r;
	}
     // fonction refector qui converti ce que fait le reflector
    public int convertForward(int p) {
        return ((reflection[((p)%26+26)%26])%26+26)%26;
    }

    // fonction refector qui definie ce que fait le reflector
    @Override
    public int convertBackward(int unused) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void advance() {
    }

}
