package com.example.telegramuix.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.telegramuix.model.Contact
import com.example.telegramuix.adapter.ContactAdapter
import com.example.telegramuix.R

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class ContactFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }
    lateinit var root:View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        root = inflater.inflate(R.layout.fragment_contact, container, false)
        initViews()
        return root
    }

    private fun initViews() {
       refreshAdapter(prepareContactList())
    }

    private fun refreshAdapter(contacts: ArrayList<Contact>) {
        var adapter = ContactAdapter(contacts)
        var recyclerView = root.findViewById<RecyclerView>(R.id.recylerView)
        recyclerView.adapter = adapter
    }

    private fun prepareContactList(): ArrayList<Contact> {
        var contacts = ArrayList<Contact>()

        contacts.add(Contact(R.drawable.img, "Rustamov Odilbek", "20"))
        contacts.add(Contact(R.drawable.img, "Rustamov Odilbek", "20"))
        contacts.add(Contact(R.drawable.img, "Rustamov Odilbek", "20"))
        contacts.add(Contact(R.drawable.img, "Rustamov Odilbek", "20"))
        contacts.add(Contact(R.drawable.img, "Rustamov Odilbek", "20"))
        contacts.add(Contact(R.drawable.img, "Rustamov Odilbek", "20"))
        contacts.add(Contact(R.drawable.img, "Rustamov Odilbek", "20"))
        contacts.add(Contact(R.drawable.img, "Rustamov Odilbek", "20"))
        contacts.add(Contact(R.drawable.img, "Rustamov Odilbek", "20"))
        contacts.add(Contact(R.drawable.img, "Rustamov Odilbek", "20"))
        contacts.add(Contact(R.drawable.img, "Rustamov Odilbek", "20"))
        contacts.add(Contact(R.drawable.img, "Rustamov Odilbek", "20"))
        contacts.add(Contact(R.drawable.img, "Rustamov Odilbek", "20"))


        return contacts
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ContactFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}