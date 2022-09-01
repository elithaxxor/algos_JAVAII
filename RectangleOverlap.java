
// PROMPT: Given an array of 2 rectangles, return a boolean that states whether two rectangles intercet
// NOTE: rect1 = Bottom Right [x1, y1]  Top Right[x2, y2] && rect2 =bottom Left  [x2, y1] Top Right [x2, y2]
public class RectangleOverlap {
    private boolean RectangleOverlap(int [] rect1, int [] rect2) {
        return {
            // compute for X-Axis
            rect1[0] < rect2[2] && rect2[0] < rect1[2] &&

            //compute for y-axis
            rect1[1] < rect2[3] && rect2[1] < rect1[3];

        }
    }
}
