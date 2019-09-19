package delight.rhinosandox;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

import java.util.Map;

public interface VariablesWithContext {
    Map<String, Object> get(Context context, Scriptable scope);
}
