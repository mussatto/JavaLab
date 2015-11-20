package com;

class OverloadingDemo {

    public OverloadingDemo(int n1, int n2, int n3){
        //do nothing
    }
    public int max(int n1, int n2, int n3) {
        return 0;
    }
    public float max(long n1, long n2, long n3) {
        return 0.0f;
    }
    public float max(float n1, float n2) {
        return 0.0f;
    }

    public static void main(String[] args){
        int num;
        float result;
        OverloadingDemo demo = new OverloadingDemo(1,2,3);
        num = demo.max(45, 98, 2);

        result = demo.max(45L, 98L, 2L);
        result = demo.max(45L, 98L, 2L);
        result = demo.max(45, 98, 2L);
        result = demo.max(45, 98, 2L);
        result = demo.max(45.0f, 0.056f);
        result = demo.max(45.0f, 0.056f);  // Overload problem
    }


}