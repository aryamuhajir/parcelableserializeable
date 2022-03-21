package com.binar.chapter3d

import android.os.Parcel
import android.os.Parcelable

data class PersegiPanjang(var panjang : Int, var lebar : Int) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(panjang)
        parcel.writeInt(lebar)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PersegiPanjang> {
        override fun createFromParcel(parcel: Parcel): PersegiPanjang {
            return PersegiPanjang(parcel)
        }

        override fun newArray(size: Int): Array<PersegiPanjang?> {
            return arrayOfNulls(size)
        }
    }
}
