package com.haura.idn.kotlinbasic.model

import android.os.Parcel
import android.os.Parcelable

data class Skincare(val namaSkincare: String?,
                    val kategoriSkincare: String?,
                    val detailSkincare: String?,
                    val gambarSkincare: Int?,
                    val url: String?) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(namaSkincare)
        parcel.writeString(kategoriSkincare)
        parcel.writeString(detailSkincare)
        parcel.writeValue(gambarSkincare)
        parcel.writeString(url)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Skincare> {
        override fun createFromParcel(parcel: Parcel): Skincare {
            return Skincare(parcel)
        }

        override fun newArray(size: Int): Array<Skincare?> {
            return arrayOfNulls(size)
        }
    }
}


