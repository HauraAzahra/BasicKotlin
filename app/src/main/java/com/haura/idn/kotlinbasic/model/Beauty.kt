package com.haura.idn.kotlinbasic.model

import android.os.Parcel
import android.os.Parcelable

data class Beauty(val namaBeauty: String?,
                    val kategoriBeauty: String?,
                    val detailBeauty: String?,
                    val gambarBeauty: Int?,
                    val urlBeauty: String?) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(namaBeauty)
        parcel.writeString(kategoriBeauty)
        parcel.writeString(detailBeauty)
        parcel.writeValue(gambarBeauty)
        parcel.writeString(urlBeauty)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Beauty> {
        override fun createFromParcel(parcel: Parcel): Beauty {
            return Beauty(parcel)
        }

        override fun newArray(size: Int): Array<Beauty?> {
            return arrayOfNulls(size)
        }
    }
}


