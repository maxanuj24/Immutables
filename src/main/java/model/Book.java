package model;

import javafx.beans.property.adapter.JavaBeanBooleanPropertyBuilder;
import org.immutables.value.Value.Immutable;
import org.immutables.value.Value.Style;

@Immutable
@Style(visibility = Style.ImplementationVisibility.PACKAGE, overshadowImplementation = true)
public abstract class Book {

    public abstract String author();

    public abstract Integer price();

    public abstract String name();

    public static class Builder extends ImmutableBook.Builder {
    }
}
