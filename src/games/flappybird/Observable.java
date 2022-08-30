package games.flappybird;

public class Observable<T> {

    private T value;
    private OnValueChangedListener<T> listener;

    public Observable(T initValue) {
        this.value = initValue;
    }

    public void setValue(T value) {
        this.value = value;
        listener.onValueChanged(value);
    }

    public void observe(OnValueChangedListener<T> listener) {
        this.listener = listener;
        this.listener.onValueChanged(value);
    }

    interface OnValueChangedListener<V> {
        void onValueChanged(V value);
    }

}
