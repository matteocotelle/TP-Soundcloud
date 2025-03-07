package com.simplecity.amp_library.glide.utils;

import android.graphics.Bitmap;

public class BitmapAndSize {

    private Bitmap bitmap;
    private Size size;

    public BitmapAndSize(Bitmap bitmap, Size size) {
        this.bitmap = bitmap;
        this.size = size;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BitmapAndSize that = (BitmapAndSize) o;

        if (bitmap != null ? !bitmap.equals(that.bitmap) : that.bitmap != null) return false;
        return size != null ? size.equals(that.size) : that.size == null;
    }

    @Override
    public int hashCode() {
        int result = bitmap != null ? bitmap.hashCode() : 0;
        result = 31 * result + (size != null ? size.hashCode() : 0);
        return result;
    }
}