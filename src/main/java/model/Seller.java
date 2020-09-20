package model;

import org.immutables.value.Value.Style;
import org.immutables.value.Value.Immutable;

import java.util.ArrayList;

@Immutable
@Style(visibility=Style.ImplementationVisibility.PACKAGE,overshadowImplementation = true)
public interface Seller {
    String name();
    String address();
    String bookname();

     class Builder extends ImmutableSeller.Builder{}
}
