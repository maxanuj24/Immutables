package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Book}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code new Book.Builder()}.
 */
@Generated(from = "Book", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
final class ImmutableBook extends Book {
  private final String author;
  private final Integer price;
  private final String name;

  private ImmutableBook(String author, Integer price, String name) {
    this.author = author;
    this.price = price;
    this.name = name;
  }

  /**
   * @return The value of the {@code author} attribute
   */
  @Override
  public String author() {
    return author;
  }

  /**
   * @return The value of the {@code price} attribute
   */
  @Override
  public Integer price() {
    return price;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @Override
  public String name() {
    return name;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Book#author() author} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for author
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBook withAuthor(String value) {
    String newValue = Objects.requireNonNull(value, "author");
    if (this.author.equals(newValue)) return this;
    return new ImmutableBook(newValue, this.price, this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Book#price() price} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for price
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBook withPrice(Integer value) {
    Integer newValue = Objects.requireNonNull(value, "price");
    if (this.price.equals(newValue)) return this;
    return new ImmutableBook(this.author, newValue, this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Book#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBook withName(String value) {
    String newValue = Objects.requireNonNull(value, "name");
    if (this.name.equals(newValue)) return this;
    return new ImmutableBook(this.author, this.price, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBook} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBook
        && equalTo((ImmutableBook) another);
  }

  private boolean equalTo(ImmutableBook another) {
    return author.equals(another.author)
        && price.equals(another.price)
        && name.equals(another.name);
  }

  /**
   * Computes a hash code from attributes: {@code author}, {@code price}, {@code name}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + author.hashCode();
    h += (h << 5) + price.hashCode();
    h += (h << 5) + name.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Book} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Book{"
        + "author=" + author
        + ", price=" + price
        + ", name=" + name
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link Book} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Book instance
   */
  public static Book copyOf(Book instance) {
    if (instance instanceof ImmutableBook) {
      return (ImmutableBook) instance;
    }
    return new Book.Builder()
        .from(instance)
        .build();
  }

  /**
   * Builds instances of type {@link Book Book}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Book", generator = "Immutables")
  public static class Builder {
    private static final long INIT_BIT_AUTHOR = 0x1L;
    private static final long INIT_BIT_PRICE = 0x2L;
    private static final long INIT_BIT_NAME = 0x4L;
    private long initBits = 0x7L;

    private String author;
    private Integer price;
    private String name;

    /**
     * Creates a builder for {@link Book Book} instances.
     * <pre>
     * new Book.Builder()
     *    .author(String) // required {@link Book#author() author}
     *    .price(Integer) // required {@link Book#price() price}
     *    .name(String) // required {@link Book#name() name}
     *    .build();
     * </pre>
     */
    public Builder() {
      if (!(this instanceof Book.Builder)) {
        throw new UnsupportedOperationException("Use: new Book.Builder()");
      }
    }

    /**
     * Fill a builder with attribute values from the provided {@code Book} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Book.Builder from(Book instance) {
      Objects.requireNonNull(instance, "instance");
      author(instance.author());
      price(instance.price());
      name(instance.name());
      return (Book.Builder) this;
    }

    /**
     * Initializes the value for the {@link Book#author() author} attribute.
     * @param author The value for author 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Book.Builder author(String author) {
      this.author = Objects.requireNonNull(author, "author");
      initBits &= ~INIT_BIT_AUTHOR;
      return (Book.Builder) this;
    }

    /**
     * Initializes the value for the {@link Book#price() price} attribute.
     * @param price The value for price 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Book.Builder price(Integer price) {
      this.price = Objects.requireNonNull(price, "price");
      initBits &= ~INIT_BIT_PRICE;
      return (Book.Builder) this;
    }

    /**
     * Initializes the value for the {@link Book#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Book.Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return (Book.Builder) this;
    }

    /**
     * Builds a new {@link Book Book}.
     * @return An immutable instance of Book
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Book build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableBook(author, price, name);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_AUTHOR) != 0) attributes.add("author");
      if ((initBits & INIT_BIT_PRICE) != 0) attributes.add("price");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build Book, some of required attributes are not set " + attributes;
    }
  }
}
