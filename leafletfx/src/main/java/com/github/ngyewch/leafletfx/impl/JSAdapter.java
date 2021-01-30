package com.github.ngyewch.leafletfx.impl;

import netscape.javascript.JSObject;
import org.apache.commons.lang3.ClassUtils;

public abstract class JSAdapter {

  private final JSContext jsContext;
  private final JSObject jsObject;

  protected JSAdapter(JSContext jsContext) {
    this(jsContext, null);
  }

  protected JSAdapter(JSContext jsContext, JSObject jsObject) {
    super();

    this.jsContext = jsContext;
    this.jsObject = jsObject;
  }

  protected JSContext getJsContext() {
    return jsContext;
  }

  protected JSObject getJsObject() {
    return jsObject;
  }

  public Object getReference() {
    return jsObject;
  }

  protected Object getJsObject(Object o) {
    if (o == null) {
      return null;
    } else if (o instanceof JSAdapter) {
      final JSAdapter adapter = (JSAdapter) o;
      return adapter.getJsObject();
    } else {
      return o;
    }
  }

  protected Object toJSObject(Object o) {
    return jsContext.toJSObject(o);
  }

  protected Object call(String methodName, Object... args) {
    final Object[] wrappedArgs = new Object[args.length];
    for (int i = 0; i < args.length; i++) {
      final Object arg = args[i];
      final Class<?> argType = (arg != null) ? arg.getClass() : null;
      if ((arg == null) || (ClassUtils.isPrimitiveOrWrapper(argType))
          || (arg instanceof String) || (arg instanceof JSObject)) {
        wrappedArgs[i] = arg;
      } else if (arg instanceof JSAdapter) {
        final JSAdapter jsAdapter = (JSAdapter) arg;
        wrappedArgs[i] = jsAdapter.getJsObject();
      } else {
        wrappedArgs[i] = toJSObject(arg);
      }
    }
    return jsObject.call(methodName, wrappedArgs);
  }

  protected boolean isDefined(JSObject jsObject, String variableName) {
    return (boolean) jsObject.eval(String.format("typeof(%s) !== 'undefined'", variableName));
  }
}
