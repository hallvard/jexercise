package encapsulation;

public class Rectangle {

        private int x = 0, y = 0, width = 0, height = 0;
        
        public int getWidth() {
                return width;
        }
        
        public int getHeight() {
                return height;
        }
        
        public int getMinX() {
                return x;
        }
        
        public int getMinY() {
                return y;
        }

        public int getMaxX() {
                return width == 0 ? 0 : x + width - 1;
        }
        
        public int getMaxY() {
                return height == 0 ? 0 : y + height - 1;
        }

        public boolean isEmpty() {
                return width == 0 || height == 0;
        }
        
        public boolean contains(int x, int y) {
                return (! isEmpty()) && (x >= getMinX() && y >= getMinY() && x <= getMaxX() && y <= getMaxY());
        }
        
        public boolean contains(Rectangle rect) {
                return (! rect.isEmpty()) && contains(rect.getMinX(), rect.getMinY()) && contains(rect.getMaxX(), rect.getMaxY());
        }
        
        public boolean add(int x, int y) {
                if (contains(x, y)) {
                        return false;
                }
                if (isEmpty()) {
                        this.x = x;
                        this.y = y;
                        this.width = 1;
                        this.height = 1;
                        return true;
                }
                int dx = x - getMinX();
                if (dx < 0) {
                        this.x = x;
                        this.width -= dx;
                } else if (dx > width) {
                        this.width = dx + 1;
                }
                int dy = y - getMinY();
                if (dy < 0) {
                        this.y = y;
                        this.height -= dy;
                } else if (dy > height) {
                        this.height = dy + 1;
                }
                return true;
        }
        
        public boolean add(Rectangle rect) {
                if (rect.isEmpty()) {
                        return false;
                }
                boolean changed1 = add(rect.getMinX(), rect.getMinY());
                boolean changed2 = add(rect.getMaxX(), rect.getMaxY());
                return changed1 || changed2;
                // why not
                // return add(rect.getMinX(), rect.getMinY()) || add(rect.getMaxX(), rect.getMaxY())
        }
        
        public Rectangle union(Rectangle rect) {
                Rectangle union = new Rectangle();
                union.add(this);
                union.add(rect);
                return union;
        }
        
        public Rectangle intersection(Rectangle rect) {
                Rectangle intersection = new Rectangle();
                int minX = Math.max(getMinX(), rect.getMinX());
                int minY = Math.max(getMinY(), rect.getMinY());
                int maxX = Math.min(getMaxX(), rect.getMaxX());
                int maxY = Math.min(getMaxY(), rect.getMaxY());
                if (minX <= maxX && minY <= maxY) {
                        intersection.add(minX, minY);
                        intersection.add(maxX, maxY);
                }
                return intersection;
        }
        
        public boolean intersects(Rectangle rect) {
                if (isEmpty() || rect.isEmpty()) {
                        return false;
                }
                return ! intersection(rect).isEmpty();
        }
}