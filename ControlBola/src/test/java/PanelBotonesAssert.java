package test.java;

import static java.lang.String.format;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

import controlBola.PanelBotones;

import javax.swing.JTextField;


/**
 * {@link PanelBotones} specific assertions - Generated by CustomAssertionGenerator.
 */
public class PanelBotonesAssert extends AbstractAssert<PanelBotonesAssert, PanelBotones> {

  /**
   * Creates a new </code>{@link PanelBotonesAssert}</code> to make assertions on actual PanelBotones.
   * @param actual the PanelBotones we want to make assertions on.
   */
  public PanelBotonesAssert(PanelBotones actual) {
    super(actual, PanelBotonesAssert.class);
  }

  /**
   * An entry point for PanelBotonesAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one's can write directly : <code>assertThat(myPanelBotones)</code> and get specific assertion with code completion.
   * @param actual the PanelBotones we want to make assertions on.
   * @return a new </code>{@link PanelBotonesAssert}</code>
   */
  public static PanelBotonesAssert assertThat(PanelBotones actual) {
    return new PanelBotonesAssert(actual);
  }

  /**
   * Verifies that the actual PanelBotones's autor is equal to the given one.
   * @param autor the given autor to compare the actual PanelBotones's autor to.
   * @return this assertion object.
   * @throws AssertionError - if the actual PanelBotones's autor is not equal to the given one.
   */
  public PanelBotonesAssert hasAutor(JTextField autor) {
    // check that actual PanelBotones we want to make assertions on is not null.
    isNotNull();

    // we overrides the default error message with a more explicit one
    String errorMessage = format("\nExpected <%s> autor to be:\n  <%s>\n but was:\n  <%s>", actual, autor, actual.getAutor());
    
    // check
    if (!actual.getAutor().equals(autor)) { throw new AssertionError(errorMessage); }

    // return the current assertion for method chaining
    return this;
  }

}