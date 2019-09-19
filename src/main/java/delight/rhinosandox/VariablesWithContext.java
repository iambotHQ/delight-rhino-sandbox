package delight.rhinosandox;

import org.mozilla.javascript.Context;

import java.util.Map;

public interface VariablesWithContext {
    Map<String, Object> get(Context context);
}
