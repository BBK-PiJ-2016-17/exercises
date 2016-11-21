/**
 * Ex 4.2 - Reducing visibility
 *
 * Some parents are concerned that their children spend too much time playing
 * with their smartphones. Create a class RestrictedSmartPhone that overrides
 * playGame(String) to make it private and thus non-visible to external classes
 * and scripts. Is this possible? Why?
 * 
 * ANSWER:
 * No, I can't reduce visibility because if I'm extending a class, I need it to
 * behave as expected, otherwise it breaks the behaviour.
 * I can always makes something more accessible, hence extend visibility, but I
 * can't reduce it.
 *
 * Weaker means more restricted, so private is weaker than protected, because
 * its visibility is less than what protected grants.
 */

public class RestrictedSmartPhone extends MobilePhone {

    public RestrictedSmartPhone(String brand) {
        // Gets brand
        super(brand);
    }

    /**
     * It returns error:
     * RestrictedSmartPhone.java:18: error: playGame(String) in 
     * RestrictedSmartPhone cannot override playGame(String) in MobilePhone
     * private String playGame(String game) {
     *                  ^ attempting to assign weaker access privileges;
     *                    was protected
     */

    // @Override
    // private String playGame(String game) {
    //     super.playGame(game);
    // }
}