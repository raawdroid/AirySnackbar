package com.raawdroid.airysnackbar

data class SwipeConfig(
    val dismissThreshold: Float = SwipeDismissTouchListener.DEFAULT_DISMISS_THRESHOLD,
    val animationDuration: Long = SwipeDismissTouchListener.DEFAULT_ANIMATION_DURATION,
    val enabled: Boolean = true,
    val minAlpha: Float = DEFAULT_MIN_ALPHA,
    val maxAlpha: Float = DEFAULT_MAX_ALPHA,
    val alphaProgressFactor: Float = DEFAULT_ALPHA_PROGRESS_FACTOR,
    val swipeDirection: SwipeDirection = SwipeDirection.Both
) {
    sealed class SwipeDirection {
        object LeftOnly : SwipeDirection()
        object RightOnly : SwipeDirection()
        object Both : SwipeDirection()
    }

    companion object {
        const val DEFAULT_MIN_ALPHA = 0.8f
        const val DEFAULT_MAX_ALPHA = 1.0f
        const val DEFAULT_ALPHA_PROGRESS_FACTOR = 0.3f
    }
} 