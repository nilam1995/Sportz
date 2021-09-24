package com.example.sportz.ui.dashboard.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import android.widget.ProgressBar
import android.widget.RadioButton
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sportz.R
import com.example.sportz.model.DataResponse
import com.example.sportz.ui.dashboard.adapter.PostAdapter
import com.example.sportz.ui.dashboard.model.PlayerModel
import com.example.sportz.ui.dashboard.viewModel.PostViewModel

class DataListFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var postAdapter: PostAdapter
    private var postViewModel: PostViewModel?= null
    private var mFragment: Context? = null
    private var toggleInd: RadioButton?= null
    private var toggleNZ: RadioButton?= null
    private val playesList: ArrayList<PlayerModel> = ArrayList<PlayerModel>()

    override fun onAttach(context: Context) {
        super.onAttach(context)
        this.mFragment = context
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_data_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        postViewModel = ViewModelProvider(requireActivity()).get<PostViewModel>(
                PostViewModel::class.java
        )
        setUi(view)
        postViewModel!!.getPost()
               postViewModel?.postLiveData?.observe(viewLifecycleOwner, Observer {
                   if (it != null) {
                       setList(it)
                   }
               })

        toggleInd?.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                setToggleSwitch("A")
            } else {
                setToggleSwitch("B")
            }
        })

    }

    private fun setToggleSwitch(s: String) {
        postViewModel?.searchByTeam(s)
        postViewModel?.searchResult?.observe(viewLifecycleOwner, Observer {
            postAdapter.setData(it)
        })
    }

    private fun setList(dataResponse: DataResponse) {
        playesList.add(PlayerModel(1, dataResponse.teams.get4().players.get3852().nameFull, dataResponse.teams.get4().players.get3852().iscaptain, false, "A"))
        playesList.add(PlayerModel(2, dataResponse.teams.get4().players.get3632().nameFull, false, dataResponse.teams.get4().players.get3632().iskeeper, "A"))
        playesList.add(PlayerModel(3, dataResponse.teams.get4().players.get3722().nameFull, false, false, "A"))
        playesList.add(PlayerModel(4, dataResponse.teams.get4().players.get4176().nameFull, false, false, "A"))
        playesList.add(PlayerModel(5, dataResponse.teams.get4().players.get4532().nameFull, false, false, "A"))
        playesList.add(PlayerModel(6, dataResponse.teams.get4().players.get5132().nameFull, false, false, "A"))
        playesList.add(PlayerModel(7, dataResponse.teams.get4().players.get63187().nameFull, false, false, "A"))
        playesList.add(PlayerModel(8, dataResponse.teams.get4().players.get63751().nameFull, false, false, "A"))
        playesList.add(PlayerModel(9, dataResponse.teams.get4().players.get65867().nameFull, false, false, "A"))
        playesList.add(PlayerModel(10, dataResponse.teams.get4().players.get66818().nameFull, false, false, "A"))
        playesList.add(PlayerModel(11, dataResponse.teams.get4().players.get9844().nameFull, false, false, "A"))
        playesList.add(PlayerModel(12, dataResponse.teams.get5().players.get4330().nameFull, dataResponse.teams.get5().players.get4330().iscaptain, false, "B"))
        playesList.add(PlayerModel(13, dataResponse.teams.get5().players.get10167().nameFull, false, dataResponse.teams.get5().players.get10167().iskeeper, "B"))
        playesList.add(PlayerModel(14, dataResponse.teams.get5().players.get10172().nameFull, false, false, "B"))
        playesList.add(PlayerModel(15, dataResponse.teams.get5().players.get11703().nameFull, false, false, "B"))
        playesList.add(PlayerModel(16, dataResponse.teams.get5().players.get11706().nameFull, false, false, "B"))
        playesList.add(PlayerModel(17, dataResponse.teams.get5().players.get3752().nameFull, false, false, "B"))
        playesList.add(PlayerModel(18, dataResponse.teams.get5().players.get4338().nameFull, false, false, "B"))
        playesList.add(PlayerModel(19, dataResponse.teams.get5().players.get4964().nameFull, false, false, "B"))
        playesList.add(PlayerModel(20, dataResponse.teams.get5().players.get57594().nameFull, false, false, "B"))
        playesList.add(PlayerModel(21, dataResponse.teams.get5().players.get57903().nameFull, false, false, "B"))
        playesList.add(PlayerModel(22, dataResponse.teams.get5().players.get60544().nameFull, false, false, "B"))

        postViewModel?.Team1(playesList)
        postViewModel?.searchByTeam("A")
        postViewModel?.searchResult?.observe(viewLifecycleOwner, Observer {
            postAdapter.setData(it)
        })
    }

    private fun setUi(view: View) {
        recyclerView=view.findViewById(R.id.recyclerView)
        toggleInd = view.findViewById(R.id.team1)
        toggleNZ = view.findViewById(R.id.team2)
          postAdapter= PostAdapter(mFragment, playesList)
          recyclerView.apply {
              setHasFixedSize(true)
              layoutManager= LinearLayoutManager(mFragment)
              adapter=postAdapter
          }
    }
}
