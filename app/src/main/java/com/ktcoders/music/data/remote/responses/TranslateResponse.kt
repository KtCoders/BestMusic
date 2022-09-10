package ir.hienglish.app.data.remote.responses

import com.google.gson.annotations.SerializedName

data class TranslateResponse(@SerializedName("sentences") var sentences: ArrayList<TranslateSentence>) {
    fun getTranslate() = sentences.firstOrNull()?.trans ?: ""
}

data class TranslateSentence(@SerializedName("trans") var trans: String? = null)