package com.binar.chapter3d

import android.os.Parcel
import android.os.Parcelable

data class PersonParcel( val nama : String?, val email : String?) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nama)
        parcel.writeString(email)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PersonParcel> {
        override fun createFromParcel(parcel: Parcel): PersonParcel {
            return PersonParcel(parcel)
        }

        override fun newArray(size: Int): Array<PersonParcel?> {
            return arrayOfNulls(size)
        }
    }

}
