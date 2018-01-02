package org.apache.commons.lang3.exception;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.internal.Iterables;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link ContextedRuntimeException} specific assertions - Generated by CustomAssertionGenerator.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public abstract class AbstractContextedRuntimeExceptionAssert<S extends AbstractContextedRuntimeExceptionAssert<S, A>, A extends ContextedRuntimeException> extends AbstractObjectAssert<S, A> {

  /**
   * Creates a new <code>{@link AbstractContextedRuntimeExceptionAssert}</code> to make assertions on actual ContextedRuntimeException.
   * @param actual the ContextedRuntimeException we want to make assertions on.
   */
  protected AbstractContextedRuntimeExceptionAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  /**
   * Verifies that the actual ContextedRuntimeException's contextEntries contains the given org.apache.commons.lang3.tuple.Pair elements.
   * @param contextEntries the given elements that should be contained in actual ContextedRuntimeException's contextEntries.
   * @return this assertion object.
   * @throws AssertionError if the actual ContextedRuntimeException's contextEntries does not contain all given org.apache.commons.lang3.tuple.Pair elements.
   */
  public S hasContextEntries(org.apache.commons.lang3.tuple.Pair... contextEntries) {
    // check that actual ContextedRuntimeException we want to make assertions on is not null.
    isNotNull();

    // check that given org.apache.commons.lang3.tuple.Pair varargs is not null.
    if (contextEntries == null) failWithMessage("Expecting contextEntries parameter not to be null.");

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getContextEntries(), contextEntries);

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual ContextedRuntimeException's contextEntries contains the given org.apache.commons.lang3.tuple.Pair elements in Collection.
   * @param contextEntries the given elements that should be contained in actual ContextedRuntimeException's contextEntries.
   * @return this assertion object.
   * @throws AssertionError if the actual ContextedRuntimeException's contextEntries does not contain all given org.apache.commons.lang3.tuple.Pair elements.
   */
  public S hasContextEntries(java.util.Collection<? extends org.apache.commons.lang3.tuple.Pair> contextEntries) {
    // check that actual ContextedRuntimeException we want to make assertions on is not null.
    isNotNull();

    // check that given org.apache.commons.lang3.tuple.Pair collection is not null.
    if (contextEntries == null) {
      failWithMessage("Expecting contextEntries parameter not to be null.");
      return myself; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getContextEntries(), contextEntries.toArray());

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual ContextedRuntimeException's contextEntries contains <b>only</b> the given org.apache.commons.lang3.tuple.Pair elements and nothing else in whatever order.
   * @param contextEntries the given elements that should be contained in actual ContextedRuntimeException's contextEntries.
   * @return this assertion object.
   * @throws AssertionError if the actual ContextedRuntimeException's contextEntries does not contain all given org.apache.commons.lang3.tuple.Pair elements.
   */
  public S hasOnlyContextEntries(org.apache.commons.lang3.tuple.Pair... contextEntries) {
    // check that actual ContextedRuntimeException we want to make assertions on is not null.
    isNotNull();

    // check that given org.apache.commons.lang3.tuple.Pair varargs is not null.
    if (contextEntries == null) failWithMessage("Expecting contextEntries parameter not to be null.");

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getContextEntries(), contextEntries);

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual ContextedRuntimeException's contextEntries contains <b>only</b> the given org.apache.commons.lang3.tuple.Pair elements in Collection and nothing else in whatever order.
   * @param contextEntries the given elements that should be contained in actual ContextedRuntimeException's contextEntries.
   * @return this assertion object.
   * @throws AssertionError if the actual ContextedRuntimeException's contextEntries does not contain all given org.apache.commons.lang3.tuple.Pair elements.
   */
  public S hasOnlyContextEntries(java.util.Collection<? extends org.apache.commons.lang3.tuple.Pair> contextEntries) {
    // check that actual ContextedRuntimeException we want to make assertions on is not null.
    isNotNull();

    // check that given org.apache.commons.lang3.tuple.Pair collection is not null.
    if (contextEntries == null) {
      failWithMessage("Expecting contextEntries parameter not to be null.");
      return myself; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getContextEntries(), contextEntries.toArray());

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual ContextedRuntimeException's contextEntries does not contain the given org.apache.commons.lang3.tuple.Pair elements.
   *
   * @param contextEntries the given elements that should not be in actual ContextedRuntimeException's contextEntries.
   * @return this assertion object.
   * @throws AssertionError if the actual ContextedRuntimeException's contextEntries contains any given org.apache.commons.lang3.tuple.Pair elements.
   */
  public S doesNotHaveContextEntries(org.apache.commons.lang3.tuple.Pair... contextEntries) {
    // check that actual ContextedRuntimeException we want to make assertions on is not null.
    isNotNull();

    // check that given org.apache.commons.lang3.tuple.Pair varargs is not null.
    if (contextEntries == null) failWithMessage("Expecting contextEntries parameter not to be null.");

    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getContextEntries(), contextEntries);

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual ContextedRuntimeException's contextEntries does not contain the given org.apache.commons.lang3.tuple.Pair elements in Collection.
   *
   * @param contextEntries the given elements that should not be in actual ContextedRuntimeException's contextEntries.
   * @return this assertion object.
   * @throws AssertionError if the actual ContextedRuntimeException's contextEntries contains any given org.apache.commons.lang3.tuple.Pair elements.
   */
  public S doesNotHaveContextEntries(java.util.Collection<? extends org.apache.commons.lang3.tuple.Pair> contextEntries) {
    // check that actual ContextedRuntimeException we want to make assertions on is not null.
    isNotNull();

    // check that given org.apache.commons.lang3.tuple.Pair collection is not null.
    if (contextEntries == null) {
      failWithMessage("Expecting contextEntries parameter not to be null.");
      return myself; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getContextEntries(), contextEntries.toArray());

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual ContextedRuntimeException has no contextEntries.
   * @return this assertion object.
   * @throws AssertionError if the actual ContextedRuntimeException's contextEntries is not empty.
   */
  public S hasNoContextEntries() {
    // check that actual ContextedRuntimeException we want to make assertions on is not null.
    isNotNull();

    // we override the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have contextEntries but had :\n  <%s>";

    // check
    if (actual.getContextEntries().iterator().hasNext()) {
      failWithMessage(assertjErrorMessage, actual, actual.getContextEntries());
    }

    // return the current assertion for method chaining
    return myself;
  }


  /**
   * Verifies that the actual ContextedRuntimeException's contextLabels contains the given String elements.
   * @param contextLabels the given elements that should be contained in actual ContextedRuntimeException's contextLabels.
   * @return this assertion object.
   * @throws AssertionError if the actual ContextedRuntimeException's contextLabels does not contain all given String elements.
   */
  public S hasContextLabels(String... contextLabels) {
    // check that actual ContextedRuntimeException we want to make assertions on is not null.
    isNotNull();

    // check that given String varargs is not null.
    if (contextLabels == null) failWithMessage("Expecting contextLabels parameter not to be null.");

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getContextLabels(), contextLabels);

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual ContextedRuntimeException's contextLabels contains the given String elements in Collection.
   * @param contextLabels the given elements that should be contained in actual ContextedRuntimeException's contextLabels.
   * @return this assertion object.
   * @throws AssertionError if the actual ContextedRuntimeException's contextLabels does not contain all given String elements.
   */
  public S hasContextLabels(java.util.Collection<? extends String> contextLabels) {
    // check that actual ContextedRuntimeException we want to make assertions on is not null.
    isNotNull();

    // check that given String collection is not null.
    if (contextLabels == null) {
      failWithMessage("Expecting contextLabels parameter not to be null.");
      return myself; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getContextLabels(), contextLabels.toArray());

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual ContextedRuntimeException's contextLabels contains <b>only</b> the given String elements and nothing else in whatever order.
   * @param contextLabels the given elements that should be contained in actual ContextedRuntimeException's contextLabels.
   * @return this assertion object.
   * @throws AssertionError if the actual ContextedRuntimeException's contextLabels does not contain all given String elements.
   */
  public S hasOnlyContextLabels(String... contextLabels) {
    // check that actual ContextedRuntimeException we want to make assertions on is not null.
    isNotNull();

    // check that given String varargs is not null.
    if (contextLabels == null) failWithMessage("Expecting contextLabels parameter not to be null.");

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getContextLabels(), contextLabels);

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual ContextedRuntimeException's contextLabels contains <b>only</b> the given String elements in Collection and nothing else in whatever order.
   * @param contextLabels the given elements that should be contained in actual ContextedRuntimeException's contextLabels.
   * @return this assertion object.
   * @throws AssertionError if the actual ContextedRuntimeException's contextLabels does not contain all given String elements.
   */
  public S hasOnlyContextLabels(java.util.Collection<? extends String> contextLabels) {
    // check that actual ContextedRuntimeException we want to make assertions on is not null.
    isNotNull();

    // check that given String collection is not null.
    if (contextLabels == null) {
      failWithMessage("Expecting contextLabels parameter not to be null.");
      return myself; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getContextLabels(), contextLabels.toArray());

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual ContextedRuntimeException's contextLabels does not contain the given String elements.
   *
   * @param contextLabels the given elements that should not be in actual ContextedRuntimeException's contextLabels.
   * @return this assertion object.
   * @throws AssertionError if the actual ContextedRuntimeException's contextLabels contains any given String elements.
   */
  public S doesNotHaveContextLabels(String... contextLabels) {
    // check that actual ContextedRuntimeException we want to make assertions on is not null.
    isNotNull();

    // check that given String varargs is not null.
    if (contextLabels == null) failWithMessage("Expecting contextLabels parameter not to be null.");

    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getContextLabels(), contextLabels);

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual ContextedRuntimeException's contextLabels does not contain the given String elements in Collection.
   *
   * @param contextLabels the given elements that should not be in actual ContextedRuntimeException's contextLabels.
   * @return this assertion object.
   * @throws AssertionError if the actual ContextedRuntimeException's contextLabels contains any given String elements.
   */
  public S doesNotHaveContextLabels(java.util.Collection<? extends String> contextLabels) {
    // check that actual ContextedRuntimeException we want to make assertions on is not null.
    isNotNull();

    // check that given String collection is not null.
    if (contextLabels == null) {
      failWithMessage("Expecting contextLabels parameter not to be null.");
      return myself; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getContextLabels(), contextLabels.toArray());

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual ContextedRuntimeException has no contextLabels.
   * @return this assertion object.
   * @throws AssertionError if the actual ContextedRuntimeException's contextLabels is not empty.
   */
  public S hasNoContextLabels() {
    // check that actual ContextedRuntimeException we want to make assertions on is not null.
    isNotNull();

    // we override the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have contextLabels but had :\n  <%s>";

    // check
    if (actual.getContextLabels().iterator().hasNext()) {
      failWithMessage(assertjErrorMessage, actual, actual.getContextLabels());
    }

    // return the current assertion for method chaining
    return myself;
  }


  /**
   * Verifies that the actual ContextedRuntimeException's message is equal to the given one.
   * @param message the given message to compare the actual ContextedRuntimeException's message to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ContextedRuntimeException's message is not equal to the given one.
   */
  public S hasMessage(String message) {
    // check that actual ContextedRuntimeException we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting message of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualMessage = actual.getMessage();
    if (!Objects.areEqual(actualMessage, message)) {
      failWithMessage(assertjErrorMessage, actual, message, actualMessage);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual ContextedRuntimeException's rawMessage is equal to the given one.
   * @param rawMessage the given rawMessage to compare the actual ContextedRuntimeException's rawMessage to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ContextedRuntimeException's rawMessage is not equal to the given one.
   */
  public S hasRawMessage(String rawMessage) {
    // check that actual ContextedRuntimeException we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting rawMessage of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualRawMessage = actual.getRawMessage();
    if (!Objects.areEqual(actualRawMessage, rawMessage)) {
      failWithMessage(assertjErrorMessage, actual, rawMessage, actualRawMessage);
    }

    // return the current assertion for method chaining
    return myself;
  }

}