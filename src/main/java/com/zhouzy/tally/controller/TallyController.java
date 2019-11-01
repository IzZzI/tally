package com.zhouzy.tally.controller;

import com.zhouzy.tally.entity.Tally;
import com.zhouzy.tally.repository.TallyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "tally")
@RestController
public class TallyController {
    @Autowired
    private TallyRepository tallyRepository;

    @RequestMapping(value = "/addTally", method = RequestMethod.GET)
    public int addTally(Tally tally) {
        tallyRepository.save(tally);
        return 1;
    }

    @RequestMapping(value = "/getTallyList", method = RequestMethod.GET)
    public List<Tally> getTallyList() {
        return tallyRepository.findAll();
    }

}
