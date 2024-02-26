
public class ArregloPila <T> implements PilaADT<T>{
    private T[] stack;
    private int top;
    private final int MAX = 20;

    public ArregloPila() {
        stack = (T[]) new Object[MAX];
        top = -1;
    }

    public ArregloPila(int max) {
        stack = (T[]) new Object[max];
        top = -1;
    }

    public boolean equals(Object obj) {
        boolean resp = false;

        if (obj != null && this.getClass() == obj.getClass()) {
            if (this == obj)
                resp = true;

            else if (this.top == ((ArregloPila<?>) obj).top) {
                int i = 0;
                resp = true;

                while (resp && i < this.top) {
                    if (this.stack[i] != ((ArregloPila<?>) obj).stack[i])
                        resp = false;
                    i++;
                }
            }
        }

        return resp;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = stack.length - 1; i >= 0; i--) {
            if (stack[i] != null)
                sb.append(stack[i] + " <-- ");
        }
        sb.append("Null");

        return sb.toString();
    }

    public void push(T data) {
        if (top == stack.length - 1)
            expand();

        top++;
        stack[top] = data;
    }

    private void expand() {
        T[] newStack = (T[]) new Object[stack.length * 2];

        for (int i = 0; i < stack.length; i++)
            newStack[i] = stack[i];

        stack = newStack;
    }

    public T pop() {
        if (!(isEmpty())) {
            T resp = stack[top];
            stack[top] = null;
            top--;
            return resp;
        }
        return null;
    }

    
    public boolean isEmpty() {
        return top == -1;
    }

    public T peek() {
        if (!(isEmpty()))
            return stack[top];
        return null;
    }

    public void multiPop(int n) {
        int i = 0;

        if (top >= n) {
            while (!(isEmpty()) && i < n) {
                pop();
                i++;
            }
        }
    }
}
