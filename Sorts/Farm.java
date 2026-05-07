public class Farm {

    int count = 0;

    AgriculturalCrop[] crops;

    public Farm(int indxs) {
        this.crops = new AgriculturalCrop[indxs];
    }

    public void addAgriculturalCrops(AgriculturalCrop x) {
        if (count < crops.length) {
            crops[count] = x;
            count++;
        }
    }

    public void printAllAgriculturalCrops() {
        for (int i = 0; i < count; i++) {
            System.out.println(crops[i]);
        }
    }

    public void QuickSort(int start, int end) {
        if (start >= end) {
            return;
        }

        int left = start; //crops[0];
        int right = end - 1; //crops[crops.length - 2];
        AgriculturalCrop pivot = crops[end]; //crops[crops.length - 1];

        while (left <= right) {

            while (left <= right && crops[left].getId() < pivot.getId()) {
                left++;
            }

            while (left <= right && crops[right].getId() > pivot.getId()) {
                right--;
            }

            if (left <= right) {
                AgriculturalCrop temp = crops[left];
                crops[left] = crops[right];
                crops[right] = temp;
                left++;
                right--;
            }
        }

        AgriculturalCrop temp = crops[left];
        crops[left] = crops[end];
        crops[end] = temp;

        // recursion  
        QuickSort(start, left - 1);
        QuickSort(left + 1, end);
    }

    public void BubbleSort() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {

                if (crops[j].getName().compareTo(crops[j + 1].getName()) > 0) {

                    AgriculturalCrop temp = crops[j];
                    crops[j] = crops[j + 1];
                    crops[j + 1] = temp;
                }
            }
        }
    }
}
