package games.flappybird;

import java.util.ArrayList;

public class Observable<T> {

    private T value;
    private final ArrayList<OnValueChangedListener<T>> listeners;

    public Observable(T initValue) {
        this.value = initValue;
        listeners = new ArrayList<>();
    }

    public void setValue(T value) {
        this.value = value;
        listeners.forEach(listener -> listener.onValueChanged(value));
    }

    public T getValue() {
        return value;
    }

    public void observe(OnValueChangedListener<T> listener) {
        listeners.add(listener);
        listener.onValueChanged(value);
    }

    interface OnValueChangedListener<V> {
        void onValueChanged(V value);
    }

}
