package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/**
 * Base64 tool method
 */
@SuppressWarnings("WeakerAccess")
public class Base64x {

    @NotNull
    public static String encodeToString(@NotNull byte[] src) {
        return Base64.getEncoder().encodeToString(src);
    }

    @NotNull
    public static String encodeToString(@NotNull String text) {
        return Base64.getEncoder().encodeToString(text.getBytes(Charset.forName("UTF-8")));
    }

    @NotNull
    public static String encodeToString(@NotNull ByteBuffer byteBuffer) {
        return Base64.getEncoder().encodeToString(byteBuffer.array());
    }


    @NotNull
    public static byte[] encodeToBytes(@NotNull byte[] src) {
        return Base64.getEncoder().encode(src);
    }

    @NotNull
    public static byte[] encodeToBytes(@NotNull String text) {
        return Base64.getEncoder().encode(text.getBytes(Charset.forName("UTF-8")));
    }

    @NotNull
    public static byte[] encodeToBytes(@NotNull ByteBuffer byteBuffer) {
        return Base64.getEncoder().encode(byteBuffer.array());
    }


    public static int encodeTo(@NotNull byte[] src, @NotNull byte[] dst) {
        return Base64.getEncoder().encode(src, dst);
    }

    public static int encodeTo(@NotNull String text, @NotNull byte[] dst) {
        return Base64.getEncoder().encode(text.getBytes(Charset.forName("UTF-8")), dst);
    }

    public static int encodeTo(@NotNull ByteBuffer byteBuffer, @NotNull byte[] dst) {
        return Base64.getEncoder().encode(byteBuffer.array(), dst);
    }


    @NotNull
    public static ByteBuffer encodeToBuffer(@NotNull byte[] src) {
        return Base64.getEncoder().encode(ByteBuffer.wrap(src));
    }

    @NotNull
    public static ByteBuffer encodeToBuffer(@NotNull String text) {
        return Base64.getEncoder().encode(ByteBuffer.wrap(text.getBytes(Charset.forName("UTF-8"))));
    }

    @NotNull
    public static ByteBuffer encodeToBuffer(@NotNull ByteBuffer byteBuffer) {
        return Base64.getEncoder().encode(byteBuffer);
    }


    @NotNull
    public static String urlEncodeToString(@NotNull byte[] src) {
        return Base64.getUrlEncoder().encodeToString(src);
    }

    @NotNull
    public static String urlEncodeToString(@NotNull String text) {
        return Base64.getUrlEncoder().encodeToString(text.getBytes(Charset.forName("UTF-8")));
    }

    @NotNull
    public static String urlEncodeToString(@NotNull ByteBuffer byteBuffer) {
        return Base64.getUrlEncoder().encodeToString(byteBuffer.array());
    }


    @NotNull
    public static byte[] urlEncodeToBytes(@NotNull byte[] src) {
        return Base64.getUrlEncoder().encode(src);
    }

    @NotNull
    public static byte[] urlEncodeToBytes(@NotNull String text) {
        return Base64.getUrlEncoder().encode(text.getBytes(Charset.forName("UTF-8")));
    }

    @NotNull
    public static byte[] urlEncodeToBytes(@NotNull ByteBuffer byteBuffer) {
        return Base64.getUrlEncoder().encode(byteBuffer.array());
    }


    public static int urlEncodeTo(@NotNull byte[] src, @NotNull byte[] dst) {
        return Base64.getUrlEncoder().encode(src, dst);
    }

    public static int urlEncodeTo(@NotNull String text, @NotNull byte[] dst) {
        return Base64.getUrlEncoder().encode(text.getBytes(Charset.forName("UTF-8")), dst);
    }

    public static int urlEncodeTo(@NotNull ByteBuffer byteBuffer, @NotNull byte[] dst) {
        return Base64.getUrlEncoder().encode(byteBuffer.array(), dst);
    }


    @NotNull
    public static ByteBuffer urlEncodeToBuffer(@NotNull byte[] src) {
        return Base64.getUrlEncoder().encode(ByteBuffer.wrap(src));
    }

    @NotNull
    public static ByteBuffer urlEncodeToBuffer(@NotNull String text) {
        return Base64.getUrlEncoder().encode(ByteBuffer.wrap(text.getBytes(Charset.forName("UTF-8"))));
    }

    @NotNull
    public static ByteBuffer urlEncodeToBuffer(@NotNull ByteBuffer byteBuffer) {
        return Base64.getUrlEncoder().encode(byteBuffer);
    }


    @NotNull
    public static String mimeEncodeToString(@NotNull byte[] src) {
        return Base64.getMimeEncoder().encodeToString(src);
    }

    @NotNull
    public static String mimeEncodeToString(@NotNull String text) {
        return Base64.getMimeEncoder().encodeToString(text.getBytes(Charset.forName("UTF-8")));
    }

    @NotNull
    public static String mimeEncodeToString(@NotNull ByteBuffer byteBuffer) {
        return Base64.getMimeEncoder().encodeToString(byteBuffer.array());
    }


    @NotNull
    public static byte[] mimeEncodeToBytes(@NotNull byte[] src) {
        return Base64.getMimeEncoder().encode(src);
    }

    @NotNull
    public static byte[] mimeEncodeToBytes(@NotNull String text) {
        return Base64.getMimeEncoder().encode(text.getBytes(Charset.forName("UTF-8")));
    }

    @NotNull
    public static byte[] mimeEncodeToBytes(@NotNull ByteBuffer byteBuffer) {
        return Base64.getMimeEncoder().encode(byteBuffer.array());
    }


    public static int mimeEncodeTo(@NotNull byte[] src, @NotNull byte[] dst) {
        return Base64.getMimeEncoder().encode(src, dst);
    }

    public static int mimeEncodeTo(@NotNull String text, @NotNull byte[] dst) {
        return Base64.getMimeEncoder().encode(text.getBytes(Charset.forName("UTF-8")), dst);
    }

    public static int mimeEncodeTo(@NotNull ByteBuffer byteBuffer, @NotNull byte[] dst) {
        return Base64.getMimeEncoder().encode(byteBuffer.array(), dst);
    }


    @NotNull
    public static ByteBuffer mimeEncodeToBuffer(@NotNull byte[] src) {
        return Base64.getMimeEncoder().encode(ByteBuffer.wrap(src));
    }

    @NotNull
    public static ByteBuffer mimeEncodeToBuffer(@NotNull String text) {
        return Base64.getMimeEncoder().encode(ByteBuffer.wrap(text.getBytes(Charset.forName("UTF-8"))));
    }

    @NotNull
    public static ByteBuffer mimeEncodeToBuffer(@NotNull ByteBuffer byteBuffer) {
        return Base64.getMimeEncoder().encode(byteBuffer);
    }


    @NotNull
    public static String mimeEncodeToString(int lineLength, @NotNull byte[] lineSeparator, @NotNull byte[] src) {
        return Base64.getMimeEncoder(lineLength, lineSeparator).encodeToString(src);
    }

    @NotNull
    public static String mimeEncodeToString(int lineLength, @NotNull byte[] lineSeparator, @NotNull String text) {
        return Base64.getMimeEncoder(lineLength, lineSeparator).encodeToString(text.getBytes(Charset.forName("UTF-8")));
    }

    @NotNull
    public static String mimeEncodeToString(int lineLength, @NotNull byte[] lineSeparator, @NotNull ByteBuffer byteBuffer) {
        return Base64.getMimeEncoder(lineLength, lineSeparator).encodeToString(byteBuffer.array());
    }


    @NotNull
    public static byte[] mimeEncodeToBytes(int lineLength, @NotNull byte[] lineSeparator, @NotNull byte[] src) {
        return Base64.getMimeEncoder(lineLength, lineSeparator).encode(src);
    }

    @NotNull
    public static byte[] mimeEncodeToBytes(int lineLength, @NotNull byte[] lineSeparator, @NotNull String text) {
        return Base64.getMimeEncoder(lineLength, lineSeparator).encode(text.getBytes(Charset.forName("UTF-8")));
    }

    @NotNull
    public static byte[] mimeEncodeToBytes(int lineLength, @NotNull byte[] lineSeparator, @NotNull ByteBuffer byteBuffer) {
        return Base64.getMimeEncoder(lineLength, lineSeparator).encode(byteBuffer.array());
    }


    public static int mimeEncodeTo(int lineLength, @NotNull byte[] lineSeparator, @NotNull byte[] src, @NotNull byte[] dst) {
        return Base64.getMimeEncoder(lineLength, lineSeparator).encode(src, dst);
    }

    public static int mimeEncodeTo(int lineLength, @NotNull byte[] lineSeparator, @NotNull String text, @NotNull byte[] dst) {
        return Base64.getMimeEncoder(lineLength, lineSeparator).encode(text.getBytes(Charset.forName("UTF-8")), dst);
    }

    public static int mimeEncodeTo(int lineLength, @NotNull byte[] lineSeparator, @NotNull ByteBuffer byteBuffer, @NotNull byte[] dst) {
        return Base64.getMimeEncoder(lineLength, lineSeparator).encode(byteBuffer.array(), dst);
    }


    @NotNull
    public static ByteBuffer mimeEncodeToBuffer(int lineLength, @NotNull byte[] lineSeparator, @NotNull byte[] src) {
        return Base64.getMimeEncoder(lineLength, lineSeparator).encode(ByteBuffer.wrap(src));
    }

    @NotNull
    public static ByteBuffer mimeEncodeToBuffer(int lineLength, @NotNull byte[] lineSeparator, @NotNull String text) {
        return Base64.getMimeEncoder(lineLength, lineSeparator).encode(ByteBuffer.wrap(text.getBytes(Charset.forName("UTF-8"))));
    }

    @NotNull
    public static ByteBuffer mimeEncodeToBuffer(int lineLength, @NotNull byte[] lineSeparator, @NotNull ByteBuffer byteBuffer) {
        return Base64.getMimeEncoder(lineLength, lineSeparator).encode(byteBuffer);
    }


    @NotNull
    public static byte[] decodeToBytes(@NotNull byte[] src) {
        return Base64.getDecoder().decode(src);
    }

    @NotNull
    public static byte[] decodeToBytes(@NotNull String text) {
        return Base64.getDecoder().decode(text.getBytes(Charset.forName("UTF-8")));
    }

    @NotNull
    public static byte[] decodeToBytes(@NotNull ByteBuffer byteBuffer) {
        return Base64.getDecoder().decode(byteBuffer).array();
    }


    @NotNull
    public static String decodeToString(@NotNull byte[] src) {
        return new String(Base64.getDecoder().decode(src), Charset.forName("UTF-8"));
    }

    @NotNull
    public static String decodeToString(@NotNull String text) {
        return new String(Base64.getDecoder().decode(text.getBytes(Charset.forName("UTF-8"))), Charset.forName("UTF-8"));
    }

    @NotNull
    public static String decodeToString(@NotNull ByteBuffer byteBuffer) {
        return new String(Base64.getDecoder().decode(byteBuffer).array(), Charset.forName("UTF-8"));
    }


    public static int decodeTo(@NotNull byte[] src, @NotNull byte[] dst) {
        return Base64.getDecoder().decode(src, dst);
    }

    public static int decodeTo(@NotNull String text, @NotNull byte[] dst) {
        return Base64.getDecoder().decode(text.getBytes(Charset.forName("UTF-8")), dst);
    }

    public static int decodeTo(@NotNull ByteBuffer byteBuffer, @NotNull byte[] dst) {
        return Base64.getDecoder().decode(byteBuffer.array(), dst);
    }


    @NotNull
    public static ByteBuffer decodeToBuffer(@NotNull byte[] src) {
        return Base64.getDecoder().decode(ByteBuffer.wrap(src));
    }

    @NotNull
    public static ByteBuffer decodeToBuffer(@NotNull String text) {
        return Base64.getDecoder().decode(ByteBuffer.wrap(text.getBytes(Charset.forName("UTF-8"))));
    }

    @NotNull
    public static ByteBuffer decodeToBuffer(@NotNull ByteBuffer byteBuffer) {
        return Base64.getDecoder().decode(byteBuffer);
    }


    @NotNull
    public static byte[] urlDecodeToBytes(@NotNull byte[] src) {
        return Base64.getUrlDecoder().decode(src);
    }

    @NotNull
    public static byte[] urlDecodeToBytes(@NotNull String text) {
        return Base64.getUrlDecoder().decode(text.getBytes(Charset.forName("UTF-8")));
    }

    @NotNull
    public static byte[] urlDecodeToBytes(@NotNull ByteBuffer byteBuffer) {
        return Base64.getUrlDecoder().decode(byteBuffer).array();
    }


    @NotNull
    public static String urlDecodeToString(@NotNull byte[] src) {
        return new String(Base64.getUrlDecoder().decode(src), Charset.forName("UTF-8"));
    }

    @NotNull
    public static String urlDecodeToString(@NotNull String text) {
        return new String(Base64.getUrlDecoder().decode(text.getBytes(Charset.forName("UTF-8"))), Charset.forName("UTF-8"));
    }

    @NotNull
    public static String urlDecodeToString(@NotNull ByteBuffer byteBuffer) {
        return new String(Base64.getUrlDecoder().decode(byteBuffer).array(), Charset.forName("UTF-8"));
    }


    public static int urlDecodeTo(@NotNull byte[] src, @NotNull byte[] dst) {
        return Base64.getUrlDecoder().decode(src, dst);
    }

    public static int urlDecodeTo(@NotNull String text, @NotNull byte[] dst) {
        return Base64.getUrlDecoder().decode(text.getBytes(Charset.forName("UTF-8")), dst);
    }

    public static int urlDecodeTo(@NotNull ByteBuffer byteBuffer, @NotNull byte[] dst) {
        return Base64.getUrlDecoder().decode(byteBuffer.array(), dst);
    }


    @NotNull
    public static ByteBuffer urlDecodeToBuffer(@NotNull byte[] src) {
        return Base64.getUrlDecoder().decode(ByteBuffer.wrap(src));
    }

    @NotNull
    public static ByteBuffer urlDecodeToBuffer(@NotNull String text) {
        return Base64.getUrlDecoder().decode(ByteBuffer.wrap(text.getBytes(Charset.forName("UTF-8"))));
    }

    @NotNull
    public static ByteBuffer urlDecodeToBuffer(@NotNull ByteBuffer byteBuffer) {
        return Base64.getUrlDecoder().decode(byteBuffer);
    }


    @NotNull
    public static byte[] mimeDecodeToBytes(@NotNull byte[] src) {
        return Base64.getMimeDecoder().decode(src);
    }

    @NotNull
    public static byte[] mimeDecodeToBytes(@NotNull String text) {
        return Base64.getMimeDecoder().decode(text.getBytes(Charset.forName("UTF-8")));
    }

    @NotNull
    public static byte[] mimeDecodeToBytes(@NotNull ByteBuffer byteBuffer) {
        return Base64.getMimeDecoder().decode(byteBuffer).array();
    }


    @NotNull
    public static String mimeDecodeToString(@NotNull byte[] src) {
        return new String(Base64.getMimeDecoder().decode(src), Charset.forName("UTF-8"));
    }

    @NotNull
    public static String mimeDecodeToString(@NotNull String text) {
        return new String(Base64.getMimeDecoder().decode(text.getBytes(Charset.forName("UTF-8"))), Charset.forName("UTF-8"));
    }

    @NotNull
    public static String mimeDecodeToString(@NotNull ByteBuffer byteBuffer) {
        return new String(Base64.getMimeDecoder().decode(byteBuffer).array(), Charset.forName("UTF-8"));
    }


    public static int mimeDecodeTo(@NotNull byte[] src, @NotNull byte[] dst) {
        return Base64.getMimeDecoder().decode(src, dst);
    }

    public static int mimeDecodeTo(@NotNull String text, @NotNull byte[] dst) {
        return Base64.getMimeDecoder().decode(text.getBytes(Charset.forName("UTF-8")), dst);
    }

    public static int mimeDecodeTo(@NotNull ByteBuffer byteBuffer, @NotNull byte[] dst) {
        return Base64.getMimeDecoder().decode(byteBuffer.array(), dst);
    }


    @NotNull
    public static ByteBuffer mimeDecodeToBuffer(@NotNull byte[] src) {
        return Base64.getMimeDecoder().decode(ByteBuffer.wrap(src));
    }

    @NotNull
    public static ByteBuffer mimeDecodeToBuffer(@NotNull String text) {
        return Base64.getMimeDecoder().decode(ByteBuffer.wrap(text.getBytes(Charset.forName("UTF-8"))));
    }

    @NotNull
    public static ByteBuffer mimeDecodeToBuffer(@NotNull ByteBuffer byteBuffer) {
        return Base64.getMimeDecoder().decode(byteBuffer);
    }
}
