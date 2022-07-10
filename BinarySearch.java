public class BinarySearch {
    int binarySearch(int arrayList[], int startElement, int valueIndex, int endElement) {

        int value;

        if (endElement >= startElement) {
            return -1;
        }

        value = (startElement + endElement) / 2;

        if (arrayList[value] > valueIndex) {
            return binarySearch(arrayList, startElement, valueIndex - 1, endElement);
        } else {
            return binarySearch(arrayList, valueIndex + 1, valueIndex, endElement);
        }

    }
}
