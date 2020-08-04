package com.venu.motionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.TransitionAdapter
import androidx.constraintlayout.widget.ConstraintSet
import kotlinx.android.synthetic.main.activity_circular_reveal.*
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.TimeoutCancellationException
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.withTimeout
import kotlin.coroutines.resume

class CircularRevealActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circular_reveal)

       /* fab.setOnClickListener {
           *//* with(root) {
                setTransition(R.id.set1_base, R.id.set2_path)
                transitionToState(R.id.set2_path)
                // startScaleDownAnimator(true)
                //  awaitTransitionComplete(R.id.set2_path)

                // 2) set2_path -> set3_reveal
                transitionToState(R.id.set3_reveal)
                // awaitTransitionComplete(R.id.set3_reveal)
            }*//*
        }*/

        with(root) {
            setTransitionListener(object : MotionLayout.TransitionListener {
                override fun onTransitionTrigger(
                    p0: MotionLayout?,
                    p1: Int,
                    p2: Boolean,
                    p3: Float
                ) {

                }

                override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {

                }

                override fun onTransitionChange(
                    p0: MotionLayout?,
                    p1: Int,
                    p2: Int,
                    p3: Float
                ) {

                }

                override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                    Log.e("state", " " + p1)
                    if (p1 == R.id.set2_path) {
                        setTransition(R.id.set2_path, R.id.set3_reveal)
                        transitionToEnd()
                    }
                }
            })
           // transitionToEnd()
        }
    }

   /* suspend fun awaitTransitionComplete(transitionId: Int, timeout: Long = 10000L) {
        // If we're already at the specified state, return now
        // Commented because interferes with multi-step animations
//        if (currentState == transitionId) return

        var listener: MotionLayout.TransitionListener? = null

        try {
            withTimeout(timeout) {
                suspendCancellableCoroutine<Unit> { continuation ->
                    val l = object : TransitionAdapter() {
                        override fun onTransitionCompleted(motionLayout: MotionLayout, currentId: Int) {
                            if (currentId == transitionId) {
                               // removeTransitionListener(this)
                                continuation.resume(Unit)
                            }
                        }
                    }
                    // If the coroutine is cancelled, remove the listener
                    continuation.invokeOnCancellation {
                       // removeTransitionListener(l)
                    }
                    // And finally add the listener
                    addTransitionListener(l)
                    listener = l
                }
            }
        } catch (tex: TimeoutCancellationException) {
            // Transition didn't happen in time. Remove our listener and throw a cancellation
            // exception to let the coroutine know
            listener?.let(::removeTransitionListener)
            throw CancellationException("Transition to state with id: $transitionId did not" +
                    " complete in timeout.", tex)
        }
    }*/


}