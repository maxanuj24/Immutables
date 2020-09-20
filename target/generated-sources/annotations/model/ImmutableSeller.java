package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Seller}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code new Seller.Builder()}.
 */
@Generated(from = "Seller", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
final class ImmutableSeller implements Seller {
  private final String name;
  private final String address;
  private final String bookname;

  private ImmutableSeller(String name, String address, String bookname) {
    this.name = name;
    this.address = address;
    this.bookname = bookname;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @Override
  public String name() {
    return name;
  }

  /**
   * @return The value of the {@code address} attribute
   */
  @Override
  public String address() {
    return address;
  }

  /**
   * @return The value of the {@code bookname} attribute
   */
  @Override
  public String bookname() {
    return bookname;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Seller#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSeller withName(String value) {
    String newValue = Objects.requireNonNull(value, "name");
    if (this.name.equals(newValue)) return this;
    return new ImmutableSeller(newValue, this.address, this.bookname);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Seller#address() address} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for address
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSeller withAddress(String value) {
    String newValue = Objects.requireNonNull(value, "address");
    if (this.address.equals(newValue)) return this;
    return new ImmutableSeller(this.name, newValue, this.bookname);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Seller#bookname() bookname} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for bookname
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSeller withBookname(String value) {
    String newValue = Objects.requireNonNull(value, "bookname");
    if (this.bookname.equals(newValue)) return this;
    return new ImmutableSeller(this.name, this.address, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSeller} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSeller
        && equalTo((ImmutableSeller) another);
  }

  private boolean equalTo(ImmutableSeller another) {
    return name.equals(another.name)
        && address.equals(another.address)
        && bookname.equals(another.bookname);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code address}, {@code bookname}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + address.hashCode();
    h += (h << 5) + bookname.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Seller} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Seller{"
        + "name=" + name
        + ", address=" + address
        + ", bookname=" + bookname
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link Seller} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Seller instance
   */
  public static Seller copyOf(Seller instance) {
    if (instance instanceof ImmutableSeller) {
      return (ImmutableSeller) instance;
    }
    return new Seller.Builder()
        .from(instance)
        .build();
  }

  /**
   * Builds instances of type {@link Seller Seller}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Seller", generator = "Immutables")
  public static class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_ADDRESS = 0x2L;
    private static final long INIT_BIT_BOOKNAME = 0x4L;
    private long initBits = 0x7L;

    private String name;
    private String address;
    private String bookname;

    /**
     * Creates a builder for {@link Seller Seller} instances.
     * <pre>
     * new Seller.Builder()
     *    .name(String) // required {@link Seller#name() name}
     *    .address(String) // required {@link Seller#address() address}
     *    .bookname(String) // required {@link Seller#bookname() bookname}
     *    .build();
     * </pre>
     */
    public Builder() {
      if (!(this instanceof Seller.Builder)) {
        throw new UnsupportedOperationException("Use: new Seller.Builder()");
      }
    }

    /**
     * Fill a builder with attribute values from the provided {@code Seller} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Seller.Builder from(Seller instance) {
      Objects.requireNonNull(instance, "instance");
      name(instance.name());
      address(instance.address());
      bookname(instance.bookname());
      return (Seller.Builder) this;
    }

    /**
     * Initializes the value for the {@link Seller#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Seller.Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return (Seller.Builder) this;
    }

    /**
     * Initializes the value for the {@link Seller#address() address} attribute.
     * @param address The value for address 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Seller.Builder address(String address) {
      this.address = Objects.requireNonNull(address, "address");
      initBits &= ~INIT_BIT_ADDRESS;
      return (Seller.Builder) this;
    }

    /**
     * Initializes the value for the {@link Seller#bookname() bookname} attribute.
     * @param bookname The value for bookname 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Seller.Builder bookname(String bookname) {
      this.bookname = Objects.requireNonNull(bookname, "bookname");
      initBits &= ~INIT_BIT_BOOKNAME;
      return (Seller.Builder) this;
    }

    /**
     * Builds a new {@link Seller Seller}.
     * @return An immutable instance of Seller
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Seller build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSeller(name, address, bookname);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_ADDRESS) != 0) attributes.add("address");
      if ((initBits & INIT_BIT_BOOKNAME) != 0) attributes.add("bookname");
      return "Cannot build Seller, some of required attributes are not set " + attributes;
    }
  }
}
